package vn.gov.hoabinh.background.executor;

import com.liferay.portal.kernel.backgroundtask.BackgroundTaskThreadLocal;
import com.liferay.portal.kernel.messaging.DestinationNames;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageBusUtil;

import vn.gov.hoabinh.background.vo.BackgroundTaskVO;

/**
 * 
 * @author vipin.bardia
 * @version 1.0
 */
public class SampleDataHandlerStatusMessageSenderUtil {

	public static void sendStatusMessage(BackgroundTaskVO messageContent) {
		// Leave if no background task
		if (!BackgroundTaskThreadLocal.hasBackgroundTask()) {
			return;
		}

		// Message Creation
		Message message = createMessage(messageContent);

		// Send message to message bus
		MessageBusUtil.sendMessage(DestinationNames.BACKGROUND_TASK_STATUS,
				message);
	}

	protected static Message createMessage(BackgroundTaskVO messageContent) {

		Message message = new Message();
		message.put("backgroundTaskId",
				BackgroundTaskThreadLocal.getBackgroundTaskId());
		
		message.put("totalNodes", messageContent.getTotalNodes());
/*

		message.put("nodesImported", messageContent.getNodesImported());

		message.put("nodesWithProblem", messageContent.getNodesWithProblem());
*/

		return message;
	}
}
