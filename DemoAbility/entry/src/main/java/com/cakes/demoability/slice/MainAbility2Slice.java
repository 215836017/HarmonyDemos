package com.cakes.demoability.slice;

import com.cakes.demoability.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.Text;

public class MainAbility2Slice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main2);

        Text text = (Text) findComponentById(ResourceTable.Id_main_2_text);
        text.setText("MainAbility2Slice");

        findComponentById(ResourceTable.Id_main_2_btn_1).setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                test1();
            }
        });
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }

    private void test1() {
        Intent intent = new Intent();
        present(new MainAbilitySlice(), intent);
    }

}
