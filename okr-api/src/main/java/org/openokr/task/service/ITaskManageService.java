package org.openokr.task.service;

import com.zzheng.framework.exception.BusinessException;
import com.zzheng.framework.mybatis.dao.pojo.Page;
import org.openokr.task.request.TaskSearchVO;
import org.openokr.task.vo.MyTaskCountInfoVO;
import org.openokr.task.vo.TaskSaveVO;
import org.openokr.task.vo.TaskVO;

import java.util.List;


/**
 * Created by zhengzheng on 2018/12/18.
 */
public interface ITaskManageService {

    /**
     * 分页查询任务列表信息
     * @param page
     * @param taskSearchVO
     * @return
     * @throws Exception
     */
    Page getTakListByPage(Page page, TaskSearchVO taskSearchVO) throws BusinessException;

    /**
     * 保存任务信息
     * @param taskSaveVO
     * @return
     * @throws Exception
     */
    TaskVO saveTaskInfo(TaskSaveVO taskSaveVO) throws BusinessException;

    /**
     * 根据ID删除任务信息
     * @param taskId
     * @throws Exception
     */
    void delTaskInfoById(String taskId) throws BusinessException;

    /**
     * 根据ID获取任务详情
     * @param taskId
     * @return
     * @throws Exception
     */
    TaskSaveVO getTaskDetailById(String taskId) throws BusinessException;

    /**
     * 获取首页我的报工统计信息
     * @param userId
     * @return
     * @throws BusinessException
     */
    List<MyTaskCountInfoVO> getMyTaskCountInfo(String userId) throws BusinessException;

    /**
     * 获取首页我管理的报工统计信息
     * @param userId
     * @return
     * @throws BusinessException
     */
    List<MyTaskCountInfoVO> getMyManageTaskCountInfo(String userId) throws BusinessException;
}