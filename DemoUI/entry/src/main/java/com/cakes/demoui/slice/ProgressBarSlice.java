package com.cakes.demoui.slice;

import com.cakes.demoui.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.ProgressBar;

public class ProgressBarSlice extends AbilitySlice {

    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_progress_bar);

        test1();
    }

    private void test1(){
        ProgressBar pb = (ProgressBar) findComponentById(ResourceTable.Id_pb_1);
        pb.setProgressValue(60);
        pb.setMinValue(0);
        pb.setMaxValue(100);



    }
}
