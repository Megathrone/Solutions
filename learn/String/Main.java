public static void main(String[] args){        Scanner sc = new Scanner(System.in);        while(sc.hasNext()){            int num = sc.nextInt();            HashMap<Integer,Integer> tree = new HashMap();            HashMap<Integer,Integer> child_deep = new HashMap();            //树一开始根结点为0，孩子结点个数为0            tree.put(0,0);            //孩子结点为0，深度为1            child_deep.put(0,1);            int dep = 0;            int max = 1;            for (int i = 0;i<num-1;i++){                int father = sc.nextInt();                int son = sc.nextInt();                //ArrayList里面是contains                //树里面不包含父节点或者儿子已满的情况，忽略                if(!tree.containsKey(father) || tree.get(father) >=2  ){                    continue;                }                    //父亲的孩子数+1                    tree.put(father,tree.get(father)+1);                    //孩子变为另一个父亲                    tree.put(son,0);                    //深度+1                    child_deep.put(son,child_deep.get(father)+1);                    dep = child_deep.get(son);                            if(max<dep ){                    max = dep;                }            }            System.out.println(max);            }                    }