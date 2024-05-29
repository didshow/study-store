package com.result;


    public class Result<T> {
        private int code ;
        private String msg;
        private T data;

        public Result() {
        }

        public Result(T data) {
            this.data = data;
        }

        public Result(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }
        //成功时调用
        public static <T> Result<T> success(T data){
            return new Result<>(data);
        }
        //失败时调用
        public  static  <T> Result<T> error(int code,String msg){
            return new Result<>(code, msg);
        }
    }

