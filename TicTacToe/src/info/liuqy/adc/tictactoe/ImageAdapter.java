package info.liuqy.adc.tictactoe;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * @author Evan Liu (qingyan123@gmail.com)
 *
 */
public class ImageAdapter extends BaseAdapter {

	private Context ctx;
    
    private Integer[] imgIds = {
            R.drawable.blank, R.drawable.blank, R.drawable.blank,
            R.drawable.blank, R.drawable.blank, R.drawable.blank,
            R.drawable.blank, R.drawable.blank, R.drawable.blank           
    };

    public ImageAdapter(Context ctx) {
        this.ctx = ctx;
    }
    
	/* (non-Javadoc)
	 * @see android.widget.Adapter#getCount()
	 */
	@Override
	public int getCount() {
        return imgIds.length;
    }

	/* (non-Javadoc)
	 * @see android.widget.Adapter#getItem(int)
	 */
	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see android.widget.Adapter#getItemId(int)
	 */
	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see android.widget.Adapter#getView(int, android.view.View, android.view.ViewGroup)
	 */
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		return null;
	}

}
