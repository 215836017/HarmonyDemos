package com.cakes.demoability.slice;

import com.cakes.demoability.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.Text;

public class MainAbility3Slice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main3);

        Text text = (Text) findComponentById(ResourceTable.Id_main_3_text);
        text.setText("MainAbility3Slice");

        findComponentById(ResourceTable.Id_main_3_btn_1).setClickedListener(new Component.ClickedListener() {
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
        intent.setParam("result", "this msg  is from MainAbility3Slice");
        setResult(intent);

        present(new MainAbilitySlice(), intent);
    }
}
