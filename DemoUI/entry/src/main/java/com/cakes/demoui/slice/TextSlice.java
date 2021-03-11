package com.cakes.demoui.slice;

import com.cakes.demoui.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.Text;


public class TextSlice extends AbilitySlice {

    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_text);

        test4();

        test5();

    }

    private void test4() {
        Text text = (Text) findComponentById(ResourceTable.Id_text_4);
        text.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                text.setText(text.getText() + "T");
            }
        });

    }

    private void test5() {
        Text text = (Text) findComponentById(ResourceTable.Id_text_5);
        // 跑马灯效果
        text.setTruncationMode(Text.TruncationMode.AUTO_SCROLLING);
        // 始终处于自动滚动状态
        text.setAutoScrollingCount(Text.AUTO_SCROLLING_FOREVER);
        // 启动跑马灯效果
        text.startAutoScrolling();
    }
}
