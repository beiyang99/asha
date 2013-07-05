/**
 * 
 */
package org.lee.android;

import java.util.ArrayList;
import java.util.List;

import org.lee.android.MyListView4.ViewHolder;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * @author allin
 *
 */
public class MyListView extends Activity {

	private ListView listView;
	private List<String> mData;
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		mData = getData();
		listView = new ListView(this);
		listView.setSelector(android.R.color.transparent);
		listView.setAdapter(new MyAdapter(this));
		setContentView(listView);
	}
	
	
//	@Override
//	public void onCreate(Bundle savedInstanceState){
//		super.onCreate(savedInstanceState);
//		
//		listView = new ListView(this);
//		listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,getData()));
//		setContentView(listView);
//	}
	
	
	
	private List<String> getData(){
		
		List<String> data = new ArrayList<String>();
		data.add("测试数据1");
		data.add("测试数据2");
		data.add("测试数据3");
		data.add("测试数据4");
		
		return data;
	}
	
	public final class ViewHolder{
		public TextView info;
	}
	
	
	public class MyAdapter extends BaseAdapter{

		private LayoutInflater mInflater;
		
		
		public MyAdapter(Context context){
			this.mInflater = LayoutInflater.from(context);
		}
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return mData.size();
		}

		@Override
		public Object getItem(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int arg0) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			
			ViewHolder holder = null;
			if (convertView == null) {
				
				holder=new ViewHolder();  
				
				convertView = mInflater.inflate(R.layout.vlist11, null);
				holder.info = (TextView)convertView.findViewById(R.id.info);
				convertView.setTag(holder);
				
			}else {
				
				holder = (ViewHolder)convertView.getTag();
			}
			
			
			holder.info.setText((String)mData.get(position));

			return convertView;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
