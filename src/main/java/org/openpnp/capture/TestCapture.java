package org.openpnp.capture;

import org.openpnp.capture.library.OpenpnpCaptureLibrary;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class TestCapture {
    public static void main(String[] args) throws Exception {
        OpenpnpCaptureLibrary.INSTANCE.Cap_setLogLevel(7);

        for(int i = 0; i < 1000; i++) {
            openAndClose();

            try {
                Thread.sleep(args.length > 0 ? Integer.parseInt(args[0]) : 5000);
            } catch(Exception e) {
                //ignore
            }
        }
    }

    private static void openAndClose() throws Exception {
        OpenPnpCapture capture = new OpenPnpCapture();
        System.out.println("Version: " + capture.getLibraryVersion());

        List<CaptureDevice> devices = capture.getDevices();
        for (CaptureDevice device : devices) {
            System.out.println("Device: " + device.getName());
        }

        CaptureDevice device = devices.get(0);
        List<CaptureFormat> deviceFormats = new ArrayList<>(device.getFormats());

        CaptureStream stream = device.openStream(deviceFormats.get(0));
        try {
            stream.getPropertyLimits(CaptureProperty.Zoom);
        } catch(Throwable e) {
            //ignore
        }

        for(int i = 0; i < 10; i++) {
            BufferedImage originalImage = stream.capture();

            try {
                Thread.sleep(100);
            } catch(Exception e) {
                //ignore
            }
        }

        System.out.println(capture.getContext());

        stream.close();
        capture.close();
    }
}
