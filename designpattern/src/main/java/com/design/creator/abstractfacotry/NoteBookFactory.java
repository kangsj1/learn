package com.design.creator.abstractfacotry;

/**
 * 抽象工厂还有另外一个关键要点，是因为 SimpleFactory 内，生产 Sample 和生产
 * Sample2 的方法之间有一定联系
 * 面向的是产品族的概念，一般来说NoteBook和mouse的配套使用的，但又单独的
 */
public interface NoteBookFactory {

    NoteBook createNoteBook();

    Mouse createMouse();

}
