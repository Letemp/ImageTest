package book.chapter10.imagetest;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	private boolean flag=true;//����һ����־����
	private ImageButton myBtn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);//���ý��沼���ļ�
		myBtn=(ImageButton)this.findViewById(R.id.myImg);//����ID��ȡ����ؼ�
		myBtn.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(flag){
					myBtn.setImageResource(R.drawable.green);//����ͼƬԴ
				}else{
					myBtn.setImageResource(R.drawable.blue);//����ͼƬԴ
				}
				flag=!flag;//ÿ�ε������־�����仯
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

