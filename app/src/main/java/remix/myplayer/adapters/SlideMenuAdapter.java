package remix.myplayer.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import remix.myplayer.R;

/**
 * Created by Remix on 2015/12/10.
 */
public class SlideMenuAdapter extends BaseAdapter {
    //关于软件，搜索本地，随便来一曲，刷新乐库，退出
    private int draws[] = new int[]{R.drawable.drawer_icon_allsong,R.drawable.drawer_icon_list};
    private String strings[] = new String[]{"全部歌曲","播放列表"};
    private LayoutInflater mInflater;

    public SlideMenuAdapter(LayoutInflater mInflater) {
        this.mInflater = mInflater;
    }

    @Override
    public int getCount() {
        return strings.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View ItemView = mInflater.inflate(R.layout.slide_menu_item,null);
        ItemView.setId(position);
        ImageView mImage = (ImageView)ItemView.findViewById(R.id.slide_menu_image);
        TextView mText = (TextView)ItemView.findViewById(R.id.slide_menu_text);
        mImage.setImageResource(draws[position]);
        mText.setText(strings[position]);
        return ItemView;
    }
}