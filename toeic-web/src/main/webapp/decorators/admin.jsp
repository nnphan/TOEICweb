<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <meta name="description" content="overview &amp; stats" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

        <title><dec:title default="Admin Page"/></title>

        <!-- bootstrap & fontawesome -->
        <link rel="stylesheet" href="<c:url value='/template/admin/css/bootstrap.min.css'/>" />
        <link rel="stylesheet" href="<c:url value='/template/admin/font-awesome/4.2.0/css/font-awesome.min.css'/>" />


        <!-- text fonts -->
        <link rel="stylesheet" href="<c:url value= '/template/admin/fonts/fonts.googleapis.com.css'/>" />

        <!-- ace styles -->
        <link rel="stylesheet" href="<c:url value='/template/admin/css/ace.min.css'/>" class="ace-main-stylesheet" id="main-ace-style" />

        <!-- ace settings handler -->

        <script src="<c:url value='/template/admin/js/ace-extra.min.js'/>"></script>


        <dec:head/>

    </head>


    <body class="no-skin">

        <!-- Header -->
        <%@ include file="/common/admin/header.jsp" %>
        <!-- End Header -->

        <div class="main-container ace-save-state" id="main-container">

            <script type="text/javascript">
                try{ace.settings.loadState('main-container')}catch(e){}
            </script>

            <!-- Begin menu -->
            <%@ include file="/common/admin/menu.jsp" %>
            <!-- End menu -->


            <!-- Begin body -->
            <dec:body/>
            <!-- End body -->

            <!-- Begin footer -->
            <%@ include file="/common/admin/footer.jsp" %>
            <!-- end footer -->

            <a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
                <i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
            </a>

        </div>
        <!-- /.main-container -->




        <script src="<c:url value='/template/admin/js/bootstrap.min.js' />"></script>
        <script src="<c:url value='/template/admin/js/jquery-ui.custom.min.js' />"></script>
        <script src="<c:url value='/template/admin/js/jquery.ui.touch-punch.min.js' />"></script>
        <script src="<c:url value='/template/admin/js/jquery.easypiechart.min.js' />"></script>
        <script src="<c:url value='/template/admin/js/jquery.sparkline.min.js' />"></script>
        <script src="<c:url value='/template/admin/js/jquery.flot.min.js' />"></script>
        <script src="<c:url value='/template/admin/js/jquery.flot.pie.min.js' />"></script>
        <script src="<c:url value='/template/admin/js/jquery.flot.resize.min.js' />"></script>
        <script src="<c:url value='/template/admin/js/ace-elements.min.js' />"></script>
        <script src="<c:url value='/template/admin/js/ace.min.js' />"></script>
        <script src="<c:url value='/template/admin/js/bootstrap.min.js'/>"></script>

        <!-- page specific plugin scripts -->
        <script src="<c:url value='/template/admin/js/jquery-ui.min.js'/>"></script>

    <script type="text/javascript">
        function showAlertBeforeDelete(callback) {
            swal({
                title: "Xác nhận xóa",
                text: "Bạn có chắc chắn xóa những dòng đã chọn",
                type: "warning",
                showCancelButton: true,
                confirmButtonText: "Xác nhận",
                cancelButtonText: "Hủy bỏ",
                confirmButtonClass: "btn btn-success",
                cancelButtonClass: "btn btn-danger"
            }).then(function (isConfirm) {
                if (isConfirm) {
                    callback();
                }
            });
        }

    </script>

    </body>
</html>

