package com.upf.etic.documentwithqr.constants;

import java.io.File;

public class ApplicationConstants {

    public static final String APPLICATION_HOST = "http://192.168.1.40";
    public static final String APPLICATION_TEST_HOST = "http://192.168.1.40";
    public static final String APPLICATION_PORT = ":8070";
    public static final String APPLICATION_PORT_TEST = ":8060";

    public static final int WIDTH = 350;
    public static final int HEIGHT = 350;

    public static final String IMAGE_FORMAT_NAME = "PNG";
    public static final String IMAGE_FORMAT_EXTENSION = ".png";

    public static final String FOLDER_SEPARATOR = File.separator;

    public static final String TEMPORARY_DIRECTORY_IMAGES_NON_COMPRESSED = System.getProperty("java.io.tmpdir") + "user_images"
            + FOLDER_SEPARATOR + "non_compressed" + FOLDER_SEPARATOR;

    public static final String TEMPORARY_DIRECTORY_IMAGES_COMPRESSED = System.getProperty("java.io.tmpdir") + "user_images"
            + FOLDER_SEPARATOR;

    private ApplicationConstants() {
        throw new IllegalStateException("Utility class");
    }
}
