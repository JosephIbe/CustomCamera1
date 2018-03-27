package com.example.customcamera;

import android.content.Context;
import android.graphics.Camera;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;

public class CameraView extends SurfaceView implements Callback {

	private SurfaceHolder mHolder;
	private Camera mCamera;
	private Context mContext;

	public CameraView(Context context, Camera camera) {
		super(context);
		this.mContext = context;
		this.mCamera = camera;
		mHolder = getHolder();
		mHolder.addCallback(this);
		// mHolder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);

	}

	@Override
	public void surfaceCreated(SurfaceHolder holder) {
		// mCamera.setP

	}

	@Override
	public void surfaceChanged(SurfaceHolder holder, int format, int width,
			int height) {

		if (mHolder.getSurface() == null) {
			return;
		}
		try {

		} catch (Exception e) {

		}
	}

	@Override
	public void surfaceDestroyed(SurfaceHolder holder) {
		// TODO Auto-generated method stub

	}

	public void openCamera(int id) {
		int cameraId = id;
		releaseCamera();
	}

	private void releaseCamera() {
		try {
			if (mCamera != null) {
				 
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
