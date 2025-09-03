class Badge {
    public String print(Integer id, String name, String department) {
        StringBuilder result= new StringBuilder("");
        if(id != null){
                result.append("["+id+"] - ");
        }
        result.append(name);
        if(department != null){
            result.append(" - "+department.toUpperCase());
        }else{
            result.append(" - OWNER");
        }
        
        return result.toString();
    }
}
