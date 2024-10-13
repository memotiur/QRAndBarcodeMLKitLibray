package com.qubit.qrbarcode;


import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;
import androidx.camera.view.PreviewView;

public class QRScannerView extends RelativeLayout {

    private PreviewView previewView;
    private QRScannerManager qrScannerManager;

    public QRScannerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.qr_scanner_view, this, true);
        previewView = findViewById(R.id.previewView);
        qrScannerManager = new QRScannerManager(context, previewView);
        qrScannerManager.startCamera();
    }





    public PreviewView getPreviewView() {
        return previewView;
    }

    // Add methods for starting and stopping the scanner
    public void startScanning() {
        // Implement scanning logic here, interacting with previewView
    }

    public void stopScanning() {
        // Implement logic to stop scanning
    }

    // Additional methods for flashlight, zoom, etc.
}