package com.cakes.demoui;

import com.cakes.demoui.slice.*;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class MainAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
//        super.setMainRoute(MainAbility.class.getName());
//        super.setMainRoute(TextSlice.class.getName());
//        super.setMainRoute(ButtonSlice.class.getName());
//        super.setMainRoute(TextFieldSlice.class.getName());
//        super.setMainRoute(ImageSlice.class.getName());
//        super.setMainRoute(TabListSlice.class.getName());
//        super.setMainRoute(PickerSlice.class.getName());
//        super.setMainRoute(DatePickerSlice.class.getName());
//        super.setMainRoute(SwitchSlice.class.getName());
//        super.setMainRoute(RadioButtonSlice.class.getName());
        super.setMainRoute(CheckboxSlice.class.getName());
    }
}
