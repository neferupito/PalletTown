package com.nefee.pallettown.view.controller;

import javax.faces.context.FacesContext;

public abstract class PalletController {

    public void onView() {
        if (!FacesContext.getCurrentInstance().isPostback()) {
            init();
        }
    }

    public abstract void init();

}
