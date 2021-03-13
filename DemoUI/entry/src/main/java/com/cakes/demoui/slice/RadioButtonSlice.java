package com.cakes.demoui.slice;

import com.cakes.demoui.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.RadioContainer;

public class RadioButtonSlice extends AbilitySlice {

    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_radio_button);

        test1();
    }

    private void test1() {
        RadioContainer container = (RadioContainer) findComponentById(ResourceTable.Id_radio_container);
        container.mark(0);
//        container.clearFocus();

        container.setMarkChangedListener(new RadioContainer.CheckedStateChangedListener() {
            @Override
            public void onCheckedChanged(RadioContainer radioContainer, int index) {
                String format = String.format("[%c]", (char) ('A' + index));
                System.out.println("selected meg : " + format);
            }
        });

    }
}
