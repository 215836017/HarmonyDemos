package com.cakes.demoui.slice;

import com.cakes.demoui.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.TabList;

public class TabListSlice extends AbilitySlice {

    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_tablist);

        test1();
    }

    private void test1() {
        TabList tabList = (TabList) findComponentById(ResourceTable.Id_tablist_1);
        TabList.Tab tab1 =  tabList.new Tab(getContext());
        tab1.setText("Image");

        tabList.setTabLength(60); // 设置Tab的宽度
        tabList.setTabMargin(26); // 设置两个Tab之间的间距

        /*
        设置FixedMode: 默认为false，该模式下TabList的总宽度是各Tab宽度的总和，若固定了TabList的宽度，
        当超出可视区域，则可以通过滑动TabList来显示。如果设置为true，TabList的总宽度将与可视区域相同，
        各个Tab的宽度也会根据TabList的宽度而平均分配，该模式适用于Tab较少的情况。
         */
        tabList.setFixedMode(true);
        tabList.addTab(tab1);

        TabList.Tab tab2 = tabList.new Tab(getContext());
        tab2.setText("text2");

        tab2.setSelected(true);

        tabList.addTab(tab2, 0);

        TabList.Tab selectedTab = tabList.getSelectedTab();
        selectedTab.getPosition();
        tabList.getTabCount();
        tabList.addTabSelectedListener(new TabList.TabSelectedListener() {
            @Override
            public void onSelected(TabList.Tab tab) {
                // 当某个Tab从未选中状态变为选中状态时的回调
            }

            @Override
            public void onUnselected(TabList.Tab tab) {
                // 当某个Tab从选中状态变为未选中状态时的回调
            }

            @Override
            public void onReselected(TabList.Tab tab) {
                // 当某个Tab已处于选中状态，再次被点击时的状态回调
            }
        });
    }
}
