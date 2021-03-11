package com.cakes.demoui.slice;

import com.cakes.demoui.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.Image;
import ohos.agp.components.TextField;

public class ImageSlice extends AbilitySlice {

    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_image);

        test1();
    }

    private void test1() {
        Image image = new Image(getContext());
        image.setPixelMap(ResourceTable.Media_icon);

    }

    /*

按比例将原图扩大(缩小)到Image的宽度，居中显示。 zoom_center

按比例将原图扩大(缩小)到Image的宽度，显示在Image的上部分位置。  zoom_start

按比例将原图扩大(缩小)到Image的宽度，显示在Image的下部分位置。  zoom_end

不按比例将图片扩大/缩小到Image的大小显示。   stretch

保持原图的大小，显示在Image的中心。当原图的尺寸大于Image的尺寸时，超过部分裁剪处理。   center

按比例将原图缩小到Image的宽度，将图片的内容完整居中显示。    inside

按比例将原图扩大(缩小)到Image的宽度和高度中较大的值。如设置的高度值较大时，在垂直方向上完整显示，水平方向上超出Image宽度的部分裁剪处理。 clip_center

     */


    /*

    左对齐裁剪。    left

    右对齐裁剪。    right

    顶部对齐裁剪。  top

    底部对齐裁剪。  bottom

    居中裁剪。     center

     */
}
