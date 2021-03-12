package com.cakes.demoui.slice;

import com.cakes.demoui.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.DatePicker;
import ohos.agp.components.TimePicker;

public class DatePickerSlice extends AbilitySlice {

    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_date_picker);

        test1();

        test2();
    }

    private void test2(){
        TimePicker timePicker = (TimePicker) findComponentById(ResourceTable.Id_time_picker_1);
        int hour = timePicker.getHour();
        int minute = timePicker.getMinute();
        int second = timePicker.getSecond();


        System.out.println("hour = " + hour + ", minute = " + minute
                + ", second = " + second);

        timePicker.setHour(19);
        timePicker.setMinute(18);
        timePicker.setSecond(12);

        timePicker.setTimeChangedListener(new TimePicker.TimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int hour, int minute, int second) {
                System.out.println("selected hour = " + hour + ", minute = " + minute
                        + ", second = " + second);
            }
        });
    }

    private void test1() {
        DatePicker datePicker = (DatePicker) findComponentById(ResourceTable.Id_date_picker_1);
        int dayOfMonth = datePicker.getDayOfMonth();
        int month = datePicker.getMonth();
        int year = datePicker.getYear();

        System.out.println("dayOfMonth = " + dayOfMonth + ", month = " + month
                + ", year = " + year);


        datePicker.setValueChangedListener(new DatePicker.ValueChangedListener() {
            @Override
            public void onValueChanged(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {
                String format = String.format("%02d/%02d/%4d", dayOfMonth, monthOfYear, year);
                System.out.println("selected date is : " + format);
            }
        });
    }
}
