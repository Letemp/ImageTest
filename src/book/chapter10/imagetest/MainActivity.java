package book.chapter10.imagetest;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	private boolean flag=true;//定义一个标志变量
	private ImageButton myBtn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);//设置界面布局文件
		myBtn=(ImageButton)this.findViewById(R.id.myImg);//根据ID获取界面控件
		myBtn.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(flag){
					myBtn.setImageResource(R.drawable.green);//设置图片源
				}else{
					myBtn.setImageResource(R.drawable.blue);//设置图片源
				}
				flag=!flag;//每次单击后标志发生变化
			}
			
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

