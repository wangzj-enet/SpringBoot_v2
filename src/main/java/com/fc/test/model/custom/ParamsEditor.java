package com.fc.test.model.custom;

import com.fc.test.util.StringUtils;

public class ParamsEditor {
    String titlei;
    String descrii;
    String morei;

    public ParamsEditor(String titlei,String descrii,String morei){
        this.titlei = titlei;
        this.descrii = descrii;
        this.morei = morei;

    }

    public String getTitlei() {
        return titlei;
    }

    public void setTitlei(String titlei) {
        this.titlei = titlei;
    }

    public String getDescrii() {
        return descrii;
    }

    public void setDescrii(String descrii) {
        this.descrii = descrii;
    }

    public String getMorei() {
        return morei;
    }

    public void setMorei(String morei) {
        this.morei = morei;
    }

    @Override
    public String toString() {
        StringBuffer pathSb = new StringBuffer();
        if(StringUtils.isNotEmpty(this.titlei)&&"yes".equals(titlei)){
            pathSb.append("title");
        }
        if(StringUtils.isNotEmpty(descrii)&&"yes".equals(descrii)){
            pathSb.append("descri");
        }
        if(StringUtils.isNotEmpty(morei)&&"yes".equals(morei)){
            pathSb.append("more");
        }
        if(StringUtils.isNotEmpty(pathSb.toString())){
            pathSb.append("/");
        }
        return pathSb.toString();
    }
}
