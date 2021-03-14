package com.cakes.demoability;

import com.cakes.demoability.slice.MainAbility2Slice;
import com.cakes.demoability.slice.MainAbility3Slice;
import com.cakes.demoability.slice.MainAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

/*
Ability是应用所具备能力的抽象，也是应用程序的重要组成部分。
一个应用可以具备多种能力（即可以包含多个Ability），HarmonyOS支持应用以Ability为单位进行部署。
Ability可以分为FA（Feature Ability）和PA（Particle Ability）两种类型，每种类型为开发者提供了不同的模板，以便实现不同的业务功能。

FA支持Page Ability：
Page模板是FA唯一支持的模板，用于提供与用户交互的能力。一个Page实例可以包含一组相关页面，每个页面用一个AbilitySlice实例表示。

PA支持Service Ability和Data Ability：
Service模板：用于提供后台运行任务的能力。
Data模板：用于对外部提供统一的数据访问抽象。


不同Page中的AbilitySlice相互不可见，因此无法通过present()或presentForResult()方法直接导航到其他Page的AbilitySlice。
AbilitySlice作为Page的内部单元，以Action的形式对外暴露，因此可以通过配置Intent的Action导航到目标AbilitySlice。
Page间的导航可以使用startAbility()或startAbilityForResult()方法，获得返回结果的回调为onAbilityResult()。
在Ability中调用setResult()可以设置返回结果。详细用法需要参考Intent的 根据Operation的其他属性启动应用中 的内容
 */
public class MainAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);

        // 添加入口的AbilitySlice
        super.setMainRoute(MainAbilitySlice.class.getName());

        /*
        虽然一个Page可以包含多个AbilitySlice，但是Page进入前台时界面默认只展示一个AbilitySlice。
        默认展示的AbilitySlice是通过setMainRoute()方法来指定的。如果需要更改默认展示的AbilitySlice，
        可以通过addActionRoute()方法为此AbilitySlice配置一条路由规则。此时，当其他Page实例期望导航到此AbilitySlice时，
        可以在Intent中指定Action，详见不同Page间导航。
         */


        // 添加其他的AbilitySlice --- 切记：需要在应用配置文件（config.json）中注册
        addActionRoute("action_2", MainAbility2Slice.class.getName());
        addActionRoute("action_3", MainAbility3Slice.class.getName());
    }
}
