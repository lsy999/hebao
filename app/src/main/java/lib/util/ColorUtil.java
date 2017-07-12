package lib.util;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;

import com.lsy.hebao.app.HebaoApplication;
import java.util.regex.Pattern;

public class ColorUtil {
    /**
     * 获取资源中的颜色
     * @param color  颜色资源id
     * @return
     */
    public static int getResourcesColor(int color) {

        int ret;
        ret = ContextCompat.getColor(HebaoApplication.getInstance(), color);
        return ret;
    }
    /**
     * 将十六进制 颜色代码 转换为 int
     * @param color
     * @return
     */
    public static int HextoColor(String color) {
        // #ff00CCFF
        String reg = "#[a-f0-9A-F]{8}";
        if (!Pattern.matches(reg, color)) {
            color = "#00ffffff";
        }
        return Color.parseColor(color);
    }

    /**
     * 修改颜色透明度
     * @param color
     * @param alpha
     * @return
     */
    public static int changeAlpha(int color, int alpha) {
        int red = Color.red(color);
        int green = Color.green(color);
        int blue = Color.blue(color);

        return Color.argb(alpha, red, green, blue);
    }
}
