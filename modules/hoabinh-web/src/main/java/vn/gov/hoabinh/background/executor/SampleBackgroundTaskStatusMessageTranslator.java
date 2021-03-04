package vn.gov.hoabinh.background.executor;

import com.liferay.portal.kernel.backgroundtask.BackgroundTaskStatus;
import com.liferay.portal.kernel.backgroundtask.BackgroundTaskStatusMessageTranslator;
import com.liferay.portal.kernel.messaging.Message;

/**
 * 
 * @author vipin.bardia
 * @version 1.0
 */
public class SampleBackgroundTaskStatusMessageTranslator implements BackgroundTaskStatusMessageTranslator {

    /* (non-Javadoc)
     * @see com.liferay.portal.kernel.backgroundtask.BackgroundTaskStatusMessageTranslator#translate(com.liferay.portal.kernel.backgroundtask.BackgroundTaskStatus, com.liferay.portal.kernel.messaging.Message)
     */
    @Override 
    public void translate(
        BackgroundTaskStatus backgroundTaskStatus, Message message) {

    	backgroundTaskStatus.setAttribute(
    			"totalNodes",
    			message.getLong("totalNodes"));
/*
    	backgroundTaskStatus.setAttribute(
    			"nodesImported",
    			message.getLong("nodesImported"));
    	
    	backgroundTaskStatus.setAttribute(
    			"nodesWithProblem",
    			message.getLong("nodesWithProblem"));*/
     }
}
