
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="C" %>
 <!DOCTYPE html>
    <div class="border-end bg-white" id="sidebar-wrapper">
                <div class="sidebar-heading border-bottom bg-light">게시판(${empty logId ?'Guest' : logId})</div>
                <div class="list-group list-group-flush">
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="boardList.do">공지사항</a>
                    <a class="list-group-item list-group-item-action list-group-item-light p-3" href="boardList.do">문의사항</a>
                              
                </div>
            </div>