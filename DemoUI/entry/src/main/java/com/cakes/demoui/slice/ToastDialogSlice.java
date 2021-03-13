package com.cakes.demoui.slice;

import com.cakes.demoui.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.DirectionalLayout;
import ohos.agp.components.LayoutScatter;
import ohos.agp.utils.LayoutAlignment;
import ohos.agp.window.dialog.ToastDialog;

public class ToastDialogSlice extends AbilitySlice implements Component.ClickedListener {

    /*
    ToastDialog是在窗口上方弹出的对话框，是通知操作的简单反馈。
    ToastDialog会在一段时间后消失，在此期间，用户还可以操作当前窗口的其他组件。
     */
    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_toast_dialog);

        findComponentById(ResourceTable.Id_toast_btn_1).setClickedListener(this);
        findComponentById(ResourceTable.Id_toast_btn_2).setClickedListener(this);
        findComponentById(ResourceTable.Id_toast_btn_3).setClickedListener(this);
        findComponentById(ResourceTable.Id_toast_btn_4).setClickedListener(this);

    }

    @Override
    public void onClick(Component component) {
        if (component.getId() == ResourceTable.Id_toast_btn_1) {

            new ToastDialog(getContext())
                    .setText("This is a ToastDialog")
                    .setDuration(3000)
                    .show();

        } else if (component.getId() == ResourceTable.Id_toast_btn_2) {

            new ToastDialog(getContext())
                    .setText("This is a ToastDialog displayed in the middle")
                    .setAlignment(LayoutAlignment.CENTER)
                    .show();

        } else if (component.getId() == ResourceTable.Id_toast_btn_3) {

            DirectionalLayout toastLayout = (DirectionalLayout) LayoutScatter.getInstance(this)
                    .parse(ResourceTable.Layout_layout_toast, null, false);
            new ToastDialog(getContext())
                    .setComponent(toastLayout)
                    .setSize(DirectionalLayout.LayoutConfig.MATCH_CONTENT, DirectionalLayout.LayoutConfig.MATCH_CONTENT)
                    .setAlignment(LayoutAlignment.CENTER)
                    .show();

        } else if (component.getId() == ResourceTable.Id_toast_btn_4) {

            DirectionalLayout layout = (DirectionalLayout) LayoutScatter.getInstance(this)
                    .parse(ResourceTable.Layout_layout_toast_2, null, false);
            new ToastDialog(getContext())
                    .setComponent(layout)
                    .setSize(DirectionalLayout.LayoutConfig.MATCH_CONTENT, DirectionalLayout.LayoutConfig.MATCH_CONTENT)
                    .setAlignment(LayoutAlignment.CENTER)
                    .show();

        }
    }
}
