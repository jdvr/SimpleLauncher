package es.juandavidvega.conect2app.launcher.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;

import es.juandavidvega.conect2app.launcher.R;
import es.juandavidvega.conect2app.remote.model.AppPreview;

public class AppPreviewHolder {
    private ImageView icon;
    private View view;

    public AppPreviewHolder(View convertView) {
        icon = (ImageView) convertView.findViewById(R.id.iv_app_icon);
        this.view = convertView;
    }

    public void fillView(AppPreview appPreview) {
        ImageLoader.getInstance().displayImage(appPreview.getIcon(), icon);
    }

    public View getView() {
        return view;
    }
}
