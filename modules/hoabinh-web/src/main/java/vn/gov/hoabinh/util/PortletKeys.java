package vn.gov.hoabinh.util;

public class PortletKeys {

	public static final int PAGE = 1;
	public static final int DELTA = 20;
	public static final long LONG_DEFAULT = 0;
	public static final String STRING_DEFAULT = "";
	public static final long SELECT_BOX = -1;
	public static final String TEXT_BOX = STRING_DEFAULT;
	public static final boolean CHECK_BOX = false;
	public static final long TREE_ROOT_ID = -1;
	public static final String SET_VIEW_PARAMETER = "jspPage";
	public static final String REDIRECT_PAGE = "redirectPage";
	public static final String ERROR_REDIRECT_PAGE = "errorRedirectPage";
	public static final String SUCCESS_REDIRECT_PAGE = "successRedirectPage";
	public static final String NEXT_URL = "nextURL";
	public static final String BACK_URL = "backURL";
	
	public class SearchContainer {
		public static final String CURRENT_PAGE = "cur";
		public static final String DELTA = "delta";
	}
	
	public static class Base{
		final public static String DOI_TUONG ="doiTuong";
		final public static String MA_SO = "maSo";
		final public static String TU_NGAY = "tuNgay";
		final public static String DEN_NGAY = "denNgay";
		final public static String TRANGTHAI_HOSO = "trangThaiHoso";
		final public static String LINHVUC_ID = "linhvucId";
		final public static String LINHVUC_IDS = "linhvucIds";
		final public static String IS_CONGDAN = "isCongDan";
		final public static String NGAY_NHAN = "ngayNhan";
		final public static String TTHC_ID = "tthcId";
		final public static String HOSO_ID = "hoSoId";
		final public static String SO_BO_HS = "soBoHS";
		final public static String NGUOI_GUI_ID = "nguoiGuiId";
		final public static String TEN_NGUOI_GUI = "tenNguoiGui";
		final public static String TAB = "tab";
		final public static String COMMENT = "comment";
		final public static String FILE_DINHKEM_PREFIX = "fileDinhKem_";
		final public static String TENFILE_PREFIX = "tenFile_";
		final public static String LIST_FILE = "listFile";
		final public static String DIEUKIEN_ID = "dieuKienId";
		final public static String APPROVED = "approved";
		final public static String CHI_DOC = "readOnly";
		final public static String LA_HIEN_TAI = "laHienTai";
		final public static String TEN_DOANH_NGHIEP = "tenDoanhNghiep";
		final public static String TEN_QUOC_TE = "tenQuocTe";
		final public static String SO_DKKD = "soDKKD";
		final public static String SO_DIEN_THOAI = "soDienThoai";
		final public static String DIACHI_CHITIET = "diaChiChiTiet";
		final public static String COQUAN_QUANLY_ID = "coQuanQuanLyId";
		
		final public static String ROLE_ID = "roleId";
		final public static String USER_ID = "userId";
		
		final public static String RETURN_PREFIX = "returnPrefix";
		
		final public static String REQUEST_SUCCESS = "requestSuccess";
		
		final public static int COMMENT_MAX_LENGTH = 500;
		
		final public static int DEFAULT_POPUP_WIDTH = 600;
		final public static int DEFAULT_POPUP_HEIGHT = 400;
		
		final public static String KEYWORD = "keyWord";
		final public static String SELECT_DN = "select_dn";
		
		//Them moi cong dan
		final public static String HO_TEN = "hoTen";
		final public static String GIOITINH_ID = "gioiTinhId";
		final public static String SO_CMND = "soCMND";
		final public static String NGAY_SINH = "ngaySinh";
		final public static String NGAY_CAP = "ngayCap";
		final public static String NOI_CAP = "noiCap";
	}	
	
	public class Search{
		public static final String TIM_KIEM_THEO_LINH_VUC = "org.oep.object.portlet.cauhinhdoituong.selectbox.linhvuc";
		public static final String TIM_KIEM_THEO_CO_QUAN = "org.oep.object.portlet.cauhinhdoituong.selectbox.coquan";
	}
	
	public class CMSView {
		public static final String CMS_LIST_ARTICLE_BY_CATEGORY = "01";
		public static final String CMS_LIST_ARTICLE_STICKY = "02";
		public static final String CMS_VIEW_ARTICLE_DETAIL = "03";
	}
}
