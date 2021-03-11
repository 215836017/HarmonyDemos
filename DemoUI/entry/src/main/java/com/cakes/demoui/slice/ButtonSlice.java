package com.cakes.demoui.slice;

import com.cakes.demoui.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;

public class ButtonSlice extends AbilitySlice {

    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_button);

        test1();
    }

    private void test1(){
        Button btn = (Button) findComponentById(ResourceTable.Id_button_1);

        btn.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {

                System.out.println("点击了按钮，，，，");
            }
        });
    }
}
