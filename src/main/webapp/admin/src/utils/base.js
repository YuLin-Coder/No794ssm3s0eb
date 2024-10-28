const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm3s0eb/",
            name: "ssm3s0eb",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm3s0eb/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "安全教育平台"
        } 
    }
}
export default base
