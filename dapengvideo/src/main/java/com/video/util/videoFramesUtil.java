package com.video.util;

import org.bytedeco.javacv.FFmpegFrameGrabber;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.FrameGrabber;
import org.bytedeco.javacv.Java2DFrameConverter;
import org.springframework.util.ResourceUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Description: java类作用描述
 * @Author: yupengxia
 * @CreateDate: 2020-04-30 10:34
 * @UpdateUser: yupengxia
 * @UpdateDate: 2020-04-30 10:34
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class videoFramesUtil {

    /**
     * 每个视屏截取n张图片
     *
     * @param videoPath 视频路径
     * @param picPath 截图根目录
     * @param picCount 截图数量
     * @param isDelete 是否删除旧图片
     */
    public static void getMoreVideoPic(String videoPath, String picPath, int picCount, boolean isDelete) throws IOException {
        File video = null;
        try {
            video = ResourceUtils.getFile(videoPath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if (video != null) {
            String videoName = video.getName();
            videoName = videoName.replace(".mp4","");
            if (!picPath.endsWith("/")) {
                picPath = picPath+"/";
            }
            picPath = picPath+videoName+"_";

            for (int i = 0; i < picCount; i++) {
                try {
                    File picFile = new File(picPath+i+".jpg");

                    if (!picFile.exists() || isDelete) {
                        long framesNumber = getVideoFramesCount(video);
                        BufferedImage thumbnailImage = getVideoPic(video, framesNumber/2);

                        if (thumbnailImage != null) {
                            ImageIO.write(thumbnailImage, "jpg", picFile);
                        }
                    }
                } catch (FrameGrabber.Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 截取视频获得指定帧的图片
     *
     * @param video   源视频文件
     * @param framesNumber 视频指定帧
     */
    public static BufferedImage getVideoPic(File video, long framesNumber) {
        BufferedImage thumbnailImage = null;
        FFmpegFrameGrabber ff = new FFmpegFrameGrabber(video);
        try {
            ff.start();

            int i = 0;
            int length = ff.getLengthInFrames();
            Frame frame = null;
            while (i < length) {
                frame = ff.grabFrame();
                if ((i > framesNumber) && (frame.image != null)) {
                    break;
                }
                i++;
            }

            // 截取的帧图片
            Java2DFrameConverter converter = new Java2DFrameConverter();
            BufferedImage srcImage = converter.getBufferedImage(frame);
            int srcImageWidth = srcImage.getWidth();
            int srcImageHeight = srcImage.getHeight();

            // 对截图进行等比例缩放(缩略图)
            int width = 480;
            int height = (int) (((double) width / srcImageWidth) * srcImageHeight);
            thumbnailImage = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
            thumbnailImage.getGraphics().drawImage(srcImage.getScaledInstance(width, height, Image.SCALE_SMOOTH), 0, 0, null);

            ff.stop();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return thumbnailImage;
    }

    /**
     * 获取视频时长，单位为秒
     *
     * @param video 源视频文件
     * @return 时长（s）
     */
    public static long getVideoDuration(File video) {
        long duration = 0L;
        FFmpegFrameGrabber ff = new FFmpegFrameGrabber(video);
        try {
            ff.start();
            duration = ff.getLengthInTime() / (1000 * 1000);
            ff.stop();
        } catch (FrameGrabber.Exception e) {
            e.printStackTrace();
        }
        return duration;
    }

    /**
     * 获取视频帧数
     *
     * @param video 源视频文件
     * @return 帧
     */
    public static long getVideoFramesCount(File video) {
        long framesCount = 0L;
        FFmpegFrameGrabber ff = new FFmpegFrameGrabber(video);
        try {
            ff.start();
            framesCount = ff.getLengthInFrames();
            ff.stop();
        } catch (FrameGrabber.Exception e) {
            e.printStackTrace();
        }
        return framesCount;
    }

    /**
     * @Author：
     * @Description：获取某个文件夹最下级的所有件夹
     * @Date：
     */
    public static void getFileDirectoryPaths(String path, java.util.List<String> sumFilePaths) {
        File file = new File(path);
        File[] tempList = file.listFiles();
        if (tempList != null && tempList.length > 0) {
            for (File smallFile : tempList) {
                if (smallFile.isDirectory()) {
                    getFileDirectoryPaths(smallFile.getPath(), sumFilePaths);
                } else if (smallFile.isFile()) {
                    String suffix = smallFile.getName().substring(smallFile.getName().lastIndexOf(".") + 1);
                    if (suffix.equals("mp4")) {
                        sumFilePaths.add(smallFile.getPath());
                    }
                }
            }
        }
    }

}
