package com.sc.framework.router;

import android.content.Context;

/**
 * @author ShamsChu
 * @Date 17/5/10 下午3:54
 */
public abstract class RouterAction<T> {

    /**
     * to perform an action function
     * @param context Context
     * @param request RouterRequest
     * @return RouterResponse
     */
    public abstract RouterResponse<T> invoke(Context context, RouterRequest request);

    /**
     * action name, default is class simple name
     * @return action name
     */
    public String getName() {
        return getClass().getSimpleName();
    }

}
