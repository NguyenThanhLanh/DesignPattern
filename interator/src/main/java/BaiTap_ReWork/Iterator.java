/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap_ReWork;

/**
 *
 * @author L_DELL
 */
public abstract class Iterator<T> {
    abstract T First();
    abstract T Next();
    abstract boolean isDone();
    abstract T CurrentItem();
}
