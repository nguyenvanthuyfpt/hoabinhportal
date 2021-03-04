package vn.gov.hoabinh.background.executor;

import vn.gov.hoabinh.background.vo.BackgroundTaskVO;
import com.liferay.portal.kernel.backgroundtask.*;
import com.liferay.portal.kernel.backgroundtask.display.BackgroundTaskDisplay;
import com.liferay.portal.kernel.backgroundtask.display.BackgroundTaskDisplayFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import org.osgi.service.component.annotations.Component;

import java.io.Serializable;
import java.util.Map;

/**
 * @author vipin.bardia
 * @version 1.0
 */
@Component(
        immediate = true,
        property = {"background.task.executor.class.name=com.netcracker.cabinet.background.executor.MigrationBackgroundTaskExecutor"}, // Without this property osgi will not register this as background executor/handler
        service = BackgroundTaskExecutor.class
)
public class SampleBackgroundTaskExecutor extends BaseBackgroundTaskExecutor {
	public static final Log LOGGER = LogFactoryUtil
			.getLog(SampleBackgroundTaskExecutor.class);
	
    public void MyBackgroundTaskExecutor() {
    	setBackgroundTaskStatusMessageTranslator(
				new SampleBackgroundTaskStatusMessageTranslator());
    }

    /**
     * @param backgroundTask
     * @return BackgroundTaskResult
     */
    public BackgroundTaskResult execute(BackgroundTask backgroundTask)
        throws Exception {
		// taskContextMap which is sent by the caller
        Map<String,Serializable> taskContextMap = backgroundTask.getTaskContextMap();

        String taskName = (String)taskContextMap.get("processName") ;
		String totalNodes = (String)taskContextMap.get("totalNodes");

        //ServiceContext serviceContext  = (ServiceContext) taskContextMap.get("serviceContext");

    	if(LOGGER.isDebugEnabled()){
    		LOGGER.debug("Task Name : "+ taskName);
    	}

		BackgroundTaskVO messageContent = new BackgroundTaskVO();
		messageContent.setTotalNodes(totalNodes);

		// Sending the data to util for MessageBus
    	SampleDataHandlerStatusMessageSenderUtil.sendStatusMessage(messageContent);

		// Telling the system if, background task is successful or not
    	BackgroundTaskResult backgroundTaskResult = new BackgroundTaskResult(
				BackgroundTaskConstants.STATUS_SUCCESSFUL);
		backgroundTaskResult.setStatusMessage("Wonder full");
		return backgroundTaskResult;
    }

    @Override
    public boolean isSerial() {
        return true;
    }

    @Override
	public BackgroundTaskDisplay getBackgroundTaskDisplay(BackgroundTask backgroundTask) {
		return BackgroundTaskDisplayFactoryUtil.getBackgroundTaskDisplay(backgroundTask);
	}

	@Override
	public BackgroundTaskExecutor clone() {
		return this;
	}
}