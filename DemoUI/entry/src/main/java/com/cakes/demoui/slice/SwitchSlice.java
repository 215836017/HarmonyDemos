package com.cakes.demoui.slice;

import com.cakes.demoui.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.AbsButton;
import ohos.agp.components.Switch;

public class SwitchSlice extends AbilitySlice {

    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_switch);

        test1();
    }

    private void test1(){
        Switch uiSwitch = (Switch) findComponentById(ResourceTable.Id_switch_1);
//        uiSwitch.setStateOnText("开");
//        uiSwitch.setStateOffText("关");

        uiSwitch.setCheckedStateChangedListener(new AbsButton.CheckedStateChangedListener() {
            @Override
            public void onCheckedChanged(AbsButton absButton, boolean b) {
                // 回调处理Switch状态改变事件
            }
        });
    }
}
