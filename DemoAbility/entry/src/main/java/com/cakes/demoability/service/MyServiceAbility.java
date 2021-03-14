package com.cakes.demoability.service;

import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import ohos.rpc.IRemoteObject;
import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;

/*
基于Service模板的Ability（以下简称“Service”）主要用于后台运行任务（如执行音乐播放、文件下载等），但不提供用户交互界面。
Service可由其他应用或Ability启动，即使用户切换到其他应用，Service仍将在后台继续运行。

Service是单实例的。在一个设备上，相同的Service只会存在一个实例。
如果多个Ability共用这个实例，只有当与Service绑定的所有Ability都退出后，Service才能够退出。
由于Service是在主线程里执行的，因此，如果在Service里面的操作时间过长，开发者必须在Service里创建新的线程来处理（详见线程间通信），
防止造成主线程阻塞，应用程序无响应。

创建Services只需创建Ability的子类，实现Service相关的生命周期方法。
Service也是一种Ability，Ability为Service提供了以下生命周期方法，用户可以重写这些方法来添加自己的处理

Ability通过startAbility() 方法来启动Service后：
如果Service尚未运行，则系统会先调用onStart()来初始化Service，再回调Service的onCommand()方法来启动Service。
如果Service正在运行，则系统会直接回调Service的onCommand()方法来启动Service。


如果Service需要与Page Ability或其他应用的Service Ability进行交互，则应创建用于连接的Connection。
Service支持其他Ability通过connectAbility()方法与其进行连接。

在使用connectAbility()处理回调时，需要传入目标Service的Intent与IAbilityConnection的实例。
IAbilityConnection提供了两个方法供开发者实现：onAbilityConnectDone()用来处理连接的回调，
onAbilityDisconnectDone()用来处理断开连接的回调。
 */
public class MyServiceAbility extends Ability {
    private static final HiLogLabel LABEL_LOG = new HiLogLabel(3, 0xD001100, "Demo");

    @Override
    public void onStart(Intent intent) {
        HiLog.error(LABEL_LOG, "MyServiceAbility::onStart");
        super.onStart(intent);
    }

    @Override
    public void onBackground() {
        super.onBackground();
        HiLog.info(LABEL_LOG, "MyServiceAbility::onBackground");
    }

    @Override
    public void onStop() {
        super.onStop();
        HiLog.info(LABEL_LOG, "MyServiceAbility::onStop");
    }

    @Override
    public void onCommand(Intent intent, boolean restart, int startId) {
    }

    @Override
    public IRemoteObject onConnect(Intent intent) {
        return null;
    }

    @Override
    public void onDisconnect(Intent intent) {
    }
}