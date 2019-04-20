package best.com.bd;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ItemAdapter extends BaseAdapter {
    Context context;
    List<Picture> pictures;

    ItemAdapter(Context context, List<Picture> pictures){
        this.context = context;
        this.pictures = pictures;
    }
    public int getCount(){return pictures.size();}
    public Object getItem(int pos){ return  pictures.get(pos);}
    public long getItemId(int pos){return  pictures.get(pos).getPictureId();}

    private class ViewHolder{
        ImageView pic;
        TextView comment;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder hold = null;
        LayoutInflater inflat = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if(convertView == null){
            convertView = inflat.inflate(R.layout.item_list,null);
            hold = new ViewHolder();
            hold.pic= convertView.findViewById(R.id.picture);
            hold.comment = convertView.findViewById(R.id.comment);

            Picture pos = pictures.get(position);

//            hold.pic.setImageResource(pos.getPictureId());
            hold.pic.setImageBitmap(pos.getImage());
            hold.comment.setText(pos.getComment());
            convertView.setTag(hold);
        }
        else {
            hold = (ViewHolder) convertView.getTag();
        }
        return convertView;
    }

}
