package com.cakes.demoability.slice;

import com.cakes.demoability.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;

/*
AbilitySlice作为Page的组成单元，其生命周期是依托于其所属Page生命周期的。
AbilitySlice和Page具有相同的生命周期状态和同名的回调，当Page生命周期发生变化时，它的AbilitySlice也会发生相同的生命周期变化。
此外，AbilitySlice还具有独立于Page的生命周期变化，这发生在同一Page中的AbilitySlice之间导航时，此时Page的生命周期状态不会改变。


 AbilitySlice承载具体的页面

 AbilitySlice实例创建和管理通常由应用负责，系统仅在特定情况下会创建AbilitySlice实例。
 例如，通过导航启动某个AbilitySlice时，是由系统负责实例化；但是在同一个Page中不同的AbilitySlice间导航时则由应用负责实例化。

 当Page被系统销毁时，其所有已实例化的AbilitySlice将联动销毁，而不仅是处于前台的AbilitySlice。
 */
public class MainAbilitySlice extends AbilitySlice implements Component.ClickedListener {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);

        findComponentById(ResourceTable.Id_main_1_btn_1).setClickedListener(this);
        findComponentById(ResourceTable.Id_main_1_btn_2).setClickedListener(this);
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }

    /*
    从目标AbilitySlice返回时，能够获得其返回结果，则应当使用presentForResult()实现。
    用户从目标AbilitySlice返回时，系统将回调onResult()来接收和处理返回结果，开发者需要重写该方法。
    返回结果由目标AbilitySlice在其生命周期内通过setResult()进行设置。
     */

    @Override
    protected void onResult(int requestCode, Intent resultIntent) {
        super.onResult(requestCode, resultIntent);
        System.out.println("requestCode = " + requestCode);
    }

    @Override
    public void onClick(Component component) {
        if (component.getId() == ResourceTable.Id_main_1_btn_1) {
            test1();

        } else if (component.getId() == ResourceTable.Id_main_1_btn_2) {
            test2();
        }
    }

    private void test1() {
        present(new MainAbility2Slice(), new Intent());
    }

    private void test2() {
        presentForResult(new MainAbility3Slice(), new Intent(), 0);
    }
}
