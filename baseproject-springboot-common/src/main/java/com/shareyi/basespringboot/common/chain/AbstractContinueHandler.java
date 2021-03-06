package com.shareyi.basespringboot.common.chain;


/**
 * 基础的持续向下的handler
 * 无需返回是否继续，默认继续处理下一个
 *
 * @author zhangshibin
 * @since 2018/5/12
 */
public abstract class AbstractContinueHandler<T> extends AbstractInterruptibleHandler<T> {

    /**
     * 执行处理
     *
     * @param t 参数
     * @return 是否需要继续处理下个handler
     * @throws Exception
     */
    @Override
    protected boolean doHandle(T t) throws Exception {
        this.continueHandle(t);
        return true;
    }


    /**
     * 执行简单处理，不需要返回是否 继续下一个，默认继续
     *
     * @param t 参数
     * @throws Exception
     */
    protected abstract void continueHandle(T t) throws Exception;
}
