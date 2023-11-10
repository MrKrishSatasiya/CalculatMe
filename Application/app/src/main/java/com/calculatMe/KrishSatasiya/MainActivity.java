package com.calculatMe.KrishSatasiya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ImageView;
import java.util.Timer;
import java.util.TimerTask;
import android.content.Intent;
import android.net.Uri;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import java.text.DecimalFormat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class MainActivity extends  AppCompatActivity  { 
	
	private Timer _timer = new Timer();
	
	private String bottomprimary = "";
	private String buttonsecondry = "";
	private String textcolor = "";
	private String value1 = "";
	private String oprator = "";
	private String anss = "";
	private double shadow = 0;
	private boolean swit = false;
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private LinearLayout switch_bg;
	private LinearLayout linear15;
	private TextView light;
	private TextView dark;
	private ImageView imageview1;
	private LinearLayout linear13;
	private TextView edittext;
	private TextView num1;
	private TextView opratorr;
	private TextView num2;
	private TextView answer;
	private TextView c;
	private TextView plusmin;
	private TextView per;
	private TextView devide;
	private TextView a7;
	private TextView a8;
	private TextView a9;
	private TextView multi;
	private TextView a4;
	private TextView a5;
	private TextView a6;
	private TextView min;
	private TextView a1;
	private TextView a2;
	private TextView a3;
	private TextView add;
	private TextView a0;
	private TextView point;
	private TextView ans;
	
	private TimerTask i;
	private Intent ii = new Intent();
	private Intent ia = new Intent();
	private AlertDialog.Builder d;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		switch_bg = (LinearLayout) findViewById(R.id.switch_bg);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		light = (TextView) findViewById(R.id.light);
		dark = (TextView) findViewById(R.id.dark);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		edittext = (TextView) findViewById(R.id.edittext);
		num1 = (TextView) findViewById(R.id.num1);
		opratorr = (TextView) findViewById(R.id.opratorr);
		num2 = (TextView) findViewById(R.id.num2);
		answer = (TextView) findViewById(R.id.answer);
		c = (TextView) findViewById(R.id.c);
		plusmin = (TextView) findViewById(R.id.plusmin);
		per = (TextView) findViewById(R.id.per);
		devide = (TextView) findViewById(R.id.devide);
		a7 = (TextView) findViewById(R.id.a7);
		a8 = (TextView) findViewById(R.id.a8);
		a9 = (TextView) findViewById(R.id.a9);
		multi = (TextView) findViewById(R.id.multi);
		a4 = (TextView) findViewById(R.id.a4);
		a5 = (TextView) findViewById(R.id.a5);
		a6 = (TextView) findViewById(R.id.a6);
		min = (TextView) findViewById(R.id.min);
		a1 = (TextView) findViewById(R.id.a1);
		a2 = (TextView) findViewById(R.id.a2);
		a3 = (TextView) findViewById(R.id.a3);
		add = (TextView) findViewById(R.id.add);
		a0 = (TextView) findViewById(R.id.a0);
		point = (TextView) findViewById(R.id.point);
		ans = (TextView) findViewById(R.id.ans);
		d = new AlertDialog.Builder(this);
		
		light.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_UI(true);
			}
		});
		
		dark.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_UI(false);
			}
		});
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
				
				ia.setAction(Intent.ACTION_VIEW);
				ia.setClass(getApplicationContext(), SettingActivity.class);
				startActivity(ia);
			}
		});
		
		edittext.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		answer.setOnLongClickListener(new View.OnLongClickListener() {
			 @Override
				public boolean onLongClick(View _view) {
				Intent i = new Intent(android.content.Intent.ACTION_SEND); i.setType("text/plain"); i.putExtra(android.content.Intent.EXTRA_TEXT, ans.getText().toString()); startActivity(Intent.createChooser(i,num1.getText().toString()));
				return true;
				}
			 });
		
		answer.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		c.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				num1.setText("");
				opratorr.setText("");
				num2.setText("");
				answer.setText("");
				edittext.setText("");
			}
		});
		
		plusmin.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				com.google.android.material.snackbar.Snackbar.make(linear1, "Not available now", com.google.android.material.snackbar.Snackbar.LENGTH_SHORT).setAction("", new View.OnClickListener(){
					@Override
					public void onClick(View _view) {
						 
					}
				}).show();
			}
		});
		
		per.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				opratorr.setText("%");
				num1.setText(edittext.getText().toString());
				edittext.setText("");
			}
		});
		
		devide.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				opratorr.setText("÷");
				num1.setText(edittext.getText().toString());
				edittext.setText("");
			}
		});
		
		a7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext.setText(edittext.getText().toString().concat("7"));
			}
		});
		
		a8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext.setText(edittext.getText().toString().concat("8"));
			}
		});
		
		a9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext.setText(edittext.getText().toString().concat("9"));
			}
		});
		
		multi.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				opratorr.setText("×");
				num1.setText(edittext.getText().toString());
				edittext.setText("");
			}
		});
		
		a4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext.setText(edittext.getText().toString().concat("4"));
			}
		});
		
		a5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext.setText(edittext.getText().toString().concat("5"));
			}
		});
		
		a6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext.setText(edittext.getText().toString().concat("6"));
			}
		});
		
		min.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				opratorr.setText("-");
				num1.setText(edittext.getText().toString());
				edittext.setText("");
			}
		});
		
		a1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext.setText(edittext.getText().toString().concat("1"));
			}
		});
		
		a2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext.setText(edittext.getText().toString().concat("2"));
			}
		});
		
		a3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext.setText(edittext.getText().toString().concat("3"));
			}
		});
		
		add.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				opratorr.setText("+");
				num1.setText(edittext.getText().toString());
				edittext.setText("");
			}
		});
		
		a0.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext.setText(edittext.getText().toString().concat("0"));
			}
		});
		
		point.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext.setText(edittext.getText().toString().concat("."));
			}
		});
		
		ans.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				try{
					if (opratorr.getText().toString().equals("+")) {
						num2.setText(edittext.getText().toString());
						answer.setText("= ".concat(String.valueOf(Double.parseDouble(num1.getText().toString()) + Double.parseDouble(edittext.getText().toString()))));
					}
					if (opratorr.getText().toString().equals("-")) {
						num2.setText(edittext.getText().toString());
						answer.setText("= ".concat(String.valueOf(Double.parseDouble(num1.getText().toString()) - Double.parseDouble(edittext.getText().toString()))));
					}
					if (opratorr.getText().toString().equals("×")) {
						num2.setText(edittext.getText().toString());
						answer.setText("= ".concat(String.valueOf(Double.parseDouble(num1.getText().toString()) * Double.parseDouble(edittext.getText().toString()))));
					}
					if (opratorr.getText().toString().equals("÷")) {
						num2.setText(edittext.getText().toString());
						answer.setText("= ".concat(String.valueOf(Double.parseDouble(num1.getText().toString()) / Double.parseDouble(edittext.getText().toString()))));
					}
					if (opratorr.getText().toString().equals("%")) {
						num2.setText(edittext.getText().toString());
						answer.setText("= ".concat(String.valueOf(Double.parseDouble(num1.getText().toString()) % Double.parseDouble(edittext.getText().toString()))));
					}
				} catch (Exception e){
					com.google.android.material.snackbar.Snackbar.make(linear1, "Error in equestion", com.google.android.material.snackbar.Snackbar.LENGTH_SHORT).setAction("", new View.OnClickListener(){
						@Override
						public void onClick(View _view) {
							 
						}
					}).show();
				}
			}
		});
	}
	
	private void initializeLogic() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) { Window w = getWindow(); w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS); }
		
		
		linear1.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
		_UI(true);
		anss = "0";
		swit = true;
		ii.setClass(getApplicationContext(), SplashActivity.class);
		startActivity(ii);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Override
	public void onStart() {
		super.onStart();
		com.google.android.material.snackbar.Snackbar.make(linear1, "Welcome to CalculatMe Application", com.google.android.material.snackbar.Snackbar.LENGTH_SHORT).setAction("Ok", new View.OnClickListener(){
			@Override
			public void onClick(View _view) {
				 
			}
		}).show();
	}
	
	@Override
	public void onBackPressed() {
		d.setMessage("Are You Want To Exit !");
		d.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				finish();
			}
		});
		d.setNegativeButton("No", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		d.create().show();
	}
	public void _CardStyle (final View _view, final double _shadow, final double _radius, final String _color, final boolean _touch) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		gd.setColor(Color.parseColor(_color));
		gd.setCornerRadius((int)_radius);
		_view.setBackground(gd);
		
		if (Build.VERSION.SDK_INT >= 21){
			_view.setElevation((int)_shadow);}
		if (_touch) {
			_view.setOnTouchListener(new View.OnTouchListener() {
				@Override
				public boolean onTouch(View v, MotionEvent event) {
					switch (event.getAction()){
						case MotionEvent.ACTION_DOWN:{
							ObjectAnimator scaleX = new ObjectAnimator();
							scaleX.setTarget(_view);
							scaleX.setPropertyName("scaleX");
							scaleX.setFloatValues(0.9f);
							scaleX.setDuration(100);
							scaleX.start();
							
							ObjectAnimator scaleY = new ObjectAnimator();
							scaleY.setTarget(_view);
							scaleY.setPropertyName("scaleY");
							scaleY.setFloatValues(0.9f);
							scaleY.setDuration(100);
							scaleY.start();
							break;
						}
						case MotionEvent.ACTION_UP:{
							
							ObjectAnimator scaleX = new ObjectAnimator();
							scaleX.setTarget(_view);
							scaleX.setPropertyName("scaleX");
							scaleX.setFloatValues((float)1);
							scaleX.setDuration(100);
							scaleX.start();
							
							ObjectAnimator scaleY = new ObjectAnimator();
							scaleY.setTarget(_view);
							scaleY.setPropertyName("scaleY");
							scaleY.setFloatValues((float)1);
							scaleY.setDuration(100);
							scaleY.start();
							
							break;
						}
					}
					return false;
				}
			});
		}
	}
	
	
	public void _Textcolor (final String _color, final TextView _text) {
		_text.setTextColor(Color.parseColor(_color));
	}
	
	
	public void _UI (final boolean _Them) {
		shadow = 5;
		if (_Them) {
			//Red
			
			
			linear1.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
			linear1.setBackgroundColor(0xFFFFFFFF);
			bottomprimary = "#2196f3";
			_CardStyle(ans, shadow, 20, bottomprimary, true);
			_CardStyle(c, shadow, 20, bottomprimary, true);
			buttonsecondry = "#212121";
			_CardStyle(plusmin, shadow, 20, buttonsecondry, true);
			_CardStyle(per, shadow, 20, buttonsecondry, true);
			_CardStyle(devide, shadow, 20, buttonsecondry, true);
			_CardStyle(multi, shadow, 20, buttonsecondry, true);
			_CardStyle(min, shadow, 20, buttonsecondry, true);
			_CardStyle(add, shadow, 20, buttonsecondry, true);
			//switch
			_CardStyle(light, shadow, 10, "#2196f3", true);
			_CardStyle(dark, shadow, 10, "#424242", true);
			_CardStyle(switch_bg, shadow, 10, "#212121", true);
			textcolor = "#000000";
			_Textcolor(textcolor, a1);
			_Textcolor(textcolor, a2);
			_Textcolor(textcolor, a3);
			_Textcolor(textcolor, a4);
			_Textcolor(textcolor, a5);
			_Textcolor(textcolor, a6);
			_Textcolor(textcolor, a7);
			_Textcolor(textcolor, a8);
			_Textcolor(textcolor, a9);
			_Textcolor(textcolor, point);
			_Textcolor(textcolor, a0);
			_Textcolor(textcolor, edittext);
			_Textcolor(textcolor, num1);
			_Textcolor(textcolor, opratorr);
			_Textcolor(textcolor, num2);
			_Textcolor(textcolor, answer);
			imageview1.setImageResource(R.drawable.ic_explore_black);
		}
		else {
			
			linear1.setBackgroundColor(0xFF212121);
			bottomprimary = "#f33446";
			_CardStyle(ans, shadow, 20, bottomprimary, true);
			_CardStyle(c, shadow, 20, bottomprimary, true);
			//+,-,+/-,x,%÷
			buttonsecondry = "#424242";
			_CardStyle(plusmin, shadow, 20, buttonsecondry, true);
			_CardStyle(per, shadow, 20, buttonsecondry, true);
			_CardStyle(devide, shadow, 20, buttonsecondry, true);
			_CardStyle(multi, shadow, 20, buttonsecondry, true);
			_CardStyle(min, shadow, 20, buttonsecondry, true);
			_CardStyle(add, shadow, 20, buttonsecondry, true);
			//switch
			_CardStyle(dark, shadow, 10, "#2196f3", true);
			_CardStyle(light, shadow, 10, "#424242", true);
			_CardStyle(switch_bg, shadow, 10, "#ffffff", true);
			textcolor = "#ffffff";
			_Textcolor(textcolor, a1);
			_Textcolor(textcolor, a2);
			_Textcolor(textcolor, a3);
			_Textcolor(textcolor, a4);
			_Textcolor(textcolor, a5);
			_Textcolor(textcolor, a6);
			_Textcolor(textcolor, a7);
			_Textcolor(textcolor, a8);
			_Textcolor(textcolor, a9);
			_Textcolor(textcolor, point);
			_Textcolor(textcolor, a0);
			_Textcolor(textcolor, edittext);
			_Textcolor(textcolor, num1);
			_Textcolor(textcolor, opratorr);
			_Textcolor(textcolor, num2);
			_Textcolor(textcolor, answer);
			imageview1.setImageResource(R.drawable.ic_explore_white);
		}
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}