package com.kojavaee.updateApk;

import com.kojavaee.updateApk.R;

import android.app.Activity;
import android.os.Bundle;

/**
 * 更新视图界面类
 * 
 */
public class UpdateApkDemoActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		// 版本更新检查
		UpdateManager um = new UpdateManager(UpdateApkDemoActivity.this);
		um.checkUpdate();
	}
}