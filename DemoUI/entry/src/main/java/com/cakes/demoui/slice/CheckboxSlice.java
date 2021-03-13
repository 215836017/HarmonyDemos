package com.cakes.demoui.slice;

import com.cakes.demoui.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.AbsButton;
import ohos.agp.components.Checkbox;

public class CheckboxSlice extends AbilitySlice {

    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_check_box);

        test1();
    }

    private void test1(){
        Checkbox cb1 = (Checkbox) findComponentById(ResourceTable.Id_cb_1);
        Checkbox cb2 = (Checkbox) findComponentById(ResourceTable.Id_cb_2);
        Checkbox cb3 = (Checkbox) findComponentById(ResourceTable.Id_cb_3);
        Checkbox cb4 = (Checkbox) findComponentById(ResourceTable.Id_cb_4);
        Checkbox cb5 = (Checkbox) findComponentById(ResourceTable.Id_cb_5);

        cb1.setChecked(true);

        // 设置不同状态之间的切换：如果当前为选中状态，那么将变为未选中；如果当前是未选中状态，将变为选中状态。
        cb2.toggle();

        cb3.setCheckedStateChangedListener(new AbsButton.CheckedStateChangedListener() {
            @Override
            public void onCheckedChanged(AbsButton absButton, boolean isChecked) {
                if(isChecked){
                    System.out.println("cb 3 is checked");
                }else {
                    System.out.println("cb 3 is cancel check");
                }
            }
        });
    }
}
