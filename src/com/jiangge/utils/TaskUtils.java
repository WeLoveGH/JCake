package com.jiangge.utils;

import com.jiangge.utils.task.TaskEntity;
import com.jiangge.utils.task.TaskPoolManager;

import java.util.List;

/**
 * Java���̡߳�����ʵ���������
 * @author jiang.li
 * @date 2013-12-23 14:25
 */
public class TaskUtils {
	
	
    /**
     * ����첽����(�����б�)
     * @param taskList
     */
	public static void addTaskList(List<TaskEntity> taskList){
		TaskPoolManager.newInstance().addTasks(taskList);
	}
	
	 /**
     * ����첽����(��������)
     * @param task
     */
	public static void addTask(TaskEntity task){
		TaskPoolManager.newInstance().addTask(task);
	}
	
}
