package com.cakes.demoui.slice;

import com.cakes.demoui.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.ScrollView;

public class ScrollViewSlice extends AbilitySlice {

    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_scroll_view);

        test1();

    }

    private void test1(){

        ScrollView scrollView = (ScrollView) findComponentById(ResourceTable.Id_sc_1);
        // 据像素数平滑滚动
        scrollView.fluentScrollByY(300);

        //平滑滚动到指定位置
        scrollView.fluentScrollYTo(500);
    }
}
