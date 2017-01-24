<?xml version="1.0" encoding="UTF-8" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0">
    <jsp:directive.page language="java"
        contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" />
    <jsp:text>
        <![CDATA[ <?xml version="1.0" encoding="UTF-8" ?> ]]>
    </jsp:text>
    <jsp:text>
        <![CDATA[ <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"> ]]>
    </jsp:text>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>

<FORM action="" method="get">
<LABEL for="principal">Principal (total loan amount after studies)</LABEL>
<input type="text"></input><br/>
<LABEL for="interest">Annual Interest Rate</LABEL>
<input type="text"></input><br/>
<LABEL for="period">Payment Period (total number of months)</LABEL>
<input type="text"></input><br/>
<LABEL for="grace">Grace Period (take advantage of 6 month grace period and include grace period interest with your loan balance)</LABEL>
<input type="checkbox"></input><br/>
<input type="submit"></input>
</FORM>

</body>
</html>
</jsp:root>