package com.cakes.demoui.slice;

import com.cakes.demoui.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.TextField;

public class TextFieldSlice extends AbilitySlice {

    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_text_field);

        test1();
    }

    private void test1() {
        TextField textField = (TextField) findComponentById(ResourceTable.Id_text_field_1);
        System.out.println("文本框的内容是：" + textField.getText().trim());

        // 设置TextField不可用状态
        //通过TextField的Enable属性来控制文本框是否可用，当设置成false后，文本框不再能被输入。
        textField.setEnabled(false);

        //响应焦点变化
        textField.setFocusChangedListener(new Component.FocusChangedListener() {
            @Override
            public void onFocusChange(Component component, boolean isFocused) {
                if (isFocused) {
                    // 获取到焦点
                } else {
                    // 失去焦点
                }
            }
        });

    }
}
