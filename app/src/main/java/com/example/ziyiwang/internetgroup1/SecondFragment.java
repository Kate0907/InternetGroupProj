public class SecondFragment extends Fragment {

    View myView;
    private Button btn1;
    public SecondFragment() {
        // Required empty public constructor
    }

    private ZXingScannerView scannerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        myView=inflater.inflate(R.layout.fragment_second,container, false);
        btn1=(Button) myView.findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(getActivity(),ScanBarcode.class);
                startActivity(intent);
            }
        });

        return myView;
    }


        }
