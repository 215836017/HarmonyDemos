package com.cakes.demoui.slice;

import com.cakes.demoui.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.Picker;

public class PickerSlice extends AbilitySlice {

    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_picker);

        test1();

        test2();
    }

    private void test2(){
        Picker picker = (Picker) findComponentById(ResourceTable.Id_test_picker_2);
        String[] data = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        picker.setDisplayedData(data);

        // 获取当前是否是选择轮模式
        boolean wheelModeEnabled = picker.isWheelModeEnabled();
        picker.setWheelModeEnabled(!wheelModeEnabled);

    }

    private void test1() {
        Picker picker = (Picker) findComponentById(ResourceTable.Id_test_picker_1);
        picker.setMinValue(0);
        picker.setMaxValue(10);

        Picker.Formatter formatter = new Picker.Formatter() {
            @Override
            public String format(int i) {
                    String value;
                    switch (i) {
                        case 0:
                            value = "Mon";
                            break;
                        case 1:
                            value = "Tue";
                            break;
                        case 2:
                            value = "Wed";
                            break;
                        case 3:
                            value = "Thu";
                            break;
                        case 4:
                            value = "Fri";
                            break;
                        case 5:
                            value = "Sat";
                            break;
                        case 6:
                            value = "Sun";
                            break;
                        default:
                            value = "" + i;
                    }
                    return value;
            }
        };
        picker.setFormatter(formatter);

        picker.setValueChangedListener(new Picker.ValueChangedListener() {
            @Override
            public void onValueChanged(Picker picker, int i, int i1) {

            }
        });

        picker.setScrollListener(new Picker.ScrolledListener() {
            @Override
            public void onScrollStateUpdated(Picker picker, int i) {

            }
        });

        picker.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {

            }
        });

    }

}
